package com.trainingbasket.javaee.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.hssf.extractor.ExcelExtractor;

import com.trainingbasket.javaee.utils.Employee;
import com.trainingbasket.javaee.utils.ExcelReader;


@WebServlet("/processFile")
public class ProcessFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String UPLOAD_DIRECTORY = "";

	public ProcessFile() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/genpayslips.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String UPLOAD_DIRECTORY = getServletContext().getRealPath("/upload");
		
		if(ServletFileUpload.isMultipartContent(request)){
            try {
            	List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
              
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
     List<Employee> employees = ExcelReader.getEmployeeFromExl(UPLOAD_DIRECTORY);
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
         
        }else{
            request.setAttribute("message", "Sorry this Servlet only handles file upload request");
        }
    
        request.getRequestDispatcher("/views/payslips.jsp").forward(request, response);	}

}
