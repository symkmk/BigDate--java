package sy180928;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest
{

	public static void main(String[] args)
	{
		File file=new File("E:\\sy\\test");
		Dir(file);
	}
	
	public static void Dir(File file)
	{
		if(!file.isDirectory())
		{
			System.out.println("不是目录");
			return;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=null;
		//文件目录计数
		int filecount=0;
		int dircount=0;
		int lengCount=0;
		
		File[] listFiles = file.listFiles();
		for (File f : listFiles)
		{
			//最后修改时间
			long lastModified = f.lastModified();
			date=new Date(lastModified);
			System.out.printf("%-21s",simpleDateFormat.format(date));
			
			//看是不是目录
			String name="";
			if(f.isDirectory())
			{
				name="<Dir>";
				dircount++;
			}
			System.out.printf("%-7s",name);
			
			//长度
			String length="";
			if(f.isFile())
			{
				length+=f.length();
				filecount++;
				lengCount+=f.length();
			}
			System.out.printf("%-10s",length);
			
			
			System.out.println(f.getName());
		}
		System.out.println(filecount+"文件"+lengCount+"字节");
		System.out.println(dircount+"目录"+file.getUsableSpace());
		
	}

}
