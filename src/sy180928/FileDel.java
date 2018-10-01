package sy180928;

import java.io.File;

public class FileDel
{

	public static void main(String[] args)
	{
		File file=new File("E:\\sy\\test");
		delete(file);
		System.out.println("删除成功");

	}
	
	public static void delete(File file)
	{
		if(file.isDirectory())
		{
			File[] listFiles = file.listFiles();
			for(File f:listFiles)
			{
				delete(f);
			}
		}
		file.delete();
	}
	
	public static void delstack(File file)
	{
		
	}

}
