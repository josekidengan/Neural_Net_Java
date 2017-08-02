package neuralnet;

import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NeuralMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int converged=0;
		
		ArrayList<Integer> noofexecs=new ArrayList<Integer>();
		ArrayList<Integer> epochnos=new ArrayList<Integer>();
		
		
		for(int noofexec = 1;noofexec<100;noofexec++)
		{
			noofexecs.add(noofexec);
			
		boolean reptype=false;
		
		NeuralStruct ns=new NeuralStruct();
		ns.setReptype(reptype);
		ns.initializeWeights();		
		double error=0.0;
		int epochno=0;
		boolean flag=true;
		boolean log=true;
		
		
		// 0 for binary, 1 for bipolar
		
		
		
		
		error=0.0;
		double a[]={1.0,1.0};
		//System.out.println(ns.train(a,1.0));
		ns.train(a,1.0);
		error=error+ns.GetOutputError();
		
			
		
		
		ArrayList<Integer> epochArr=new ArrayList<Integer>();
		ArrayList<Double> epochErrArr=new ArrayList<Double>();
		while (flag)
		{
			error=0.0;
			if (!reptype)
			{
				double d[]={0.0,0.0};
				//System.out.println(ns.train(d,1.0));
				ns.train(d,1.0);
			}
			if(reptype)
			{
				double d[]={-1.0,-1.0};
				//System.out.println(ns.train(d,1.0));
				ns.train(d,1.0);
			}
			
			error=error+ns.GetOutputError();
			//System.out.println("Training error : "+error);
			//System.out.println("#########################################End of  training a pattern#########################################");
			
			if (!reptype)
			{
			double b[]={1.0,0.0};
			ns.train(b,1.0);
			}
			if(reptype)
			{
				double d[]={1.0,-1.0};
				//System.out.println(ns.train(d,1.0));
				ns.train(d,1.0);
			}
			//System.out.println(ns.train(b,1.0));
			
			error=error+ns.GetOutputError();
			//System.out.println("Training error : "+error);
			//System.out.println("#########################################End of  training a pattern#########################################");
			
			if (!reptype)
			{
			double c[]={0.0,1.0};
			//System.out.println(ns.train(c,1.0));
			ns.train(c,1.0);
			}
			if(reptype)
			{
				double d[]={-1.0,1.0};
				//System.out.println(ns.train(d,1.0));
				ns.train(d,1.0);
			}
			error=error+ns.GetOutputError();
			//System.out.println("Training error : "+error);
			//System.out.println("#########################################End of  training a pattern#########################################");
			
			if (!reptype)
			{
			double a[]={1.0,1.0};
			//System.out.println(ns.train(a,1.0));
			ns.train(a,1.0);
			}
			if(reptype)
			{
				double d[]={1.0,1.0};
				//System.out.println(ns.train(d,1.0));
				ns.train(d,1.0);
			}
			error=error+ns.GetOutputError();
			//System.out.println("Training error : "+error);
			//System.out.println("#########################################End of  training a pattern#########################################"); 
			
			
			
			
			
			//System.out.println("Training error : "+error);
			epochErrArr.add(error);
			//System.out.println("Epoch error : "+error+"\n" );
			if ((error<0.05 && error>-0.05)||epochno==5000)
			{
				flag=false;	
				
				
				
				if(error<0.05)
				{
					converged=converged+1;
				}
					
				
				
				XSSFWorkbook workbook = new XSSFWorkbook();
				XSSFSheet sheet=workbook.createSheet("data");
				ArrayList<XSSFRow> rowlist=new ArrayList<XSSFRow>();
				for (int j=0;j<epochArr.size();j++)
				{
					XSSFCell l=sheet.getRow(j).getCell(0);
					l.setCellValue(j);
					rowlist.add(sheet.createRow(j));
					sheet.createRow(epochArr.get(j)).createCell(1).setCellValue(epochArr.get(j));
					sheet.createRow(epochArr.get(j)).createCell(2).setCellValue(epochErrArr.get(j));
					rowlist.get(j).createCell(1).setCellValue(epochArr.get(j));
					rowlist.get(j).createCell(2).setCellValue(epochErrArr.get(j));
				}
				
				for(int b=0;b<epochArr.size();b++)
				{
					rowlist.get(b).getCell(0).setCellValue(b);
					rowlist.get(b).getCell(noofexec).setCellValue(epochArr.get(b));
				}
				
				try {
					FileOutputStream out =new FileOutputStream( new File("C:\\robocode\\data.xlsx"));
					workbook.write(out);
					out.close();
					workbook.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			epochArr.add(epochno);
			epochno=epochno+1;
			
			
			
*/			
			
			
/*		}
		
		
		
		
		System.out.println("Epoch number is :"+epochno+" error is "+error);
		epochnos.add(epochno);
		
	}
	
		System.out.println("converged number is :"+converged);
		
		XSSFWorkbook workbook1 = new XSSFWorkbook();
		XSSFSheet sheet=workbook1.createSheet("data2");
		ArrayList<XSSFRow> rowlist2=new ArrayList<XSSFRow>();
		for (int j=0;j<noofexecs.size();j++)
		{
			XSSFCell l=sheet.getRow(j).getCell(0);
			l.setCellValue(j);
			rowlist2.add(sheet.createRow(j));
			sheet.createRow(epochArr.get(j)).createCell(1).setCellValue(epochArr.get(j));
			sheet.createRow(epochArr.get(j)).createCell(2).setCellValue(epochErrArr.get(j));
			rowlist2.get(j).createCell(1).setCellValue(noofexecs.get(j));
			rowlist2.get(j).createCell(2).setCellValue(epochnos.get(j));
			
		}
		
		try {
			FileOutputStream out =new FileOutputStream( new File("C:\\robocode\\dataepoch.xlsx"));
			workbook1.write(out);
			out.close();
			workbook1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}


	}

