package sy180928;

import java.io.File;
import java.util.ArrayList;

/**
 * @author suyuan
 *非递归删除
 */
public class FileDelStack
{

	public static void main(String[] args)
	{
		File file=new File("E:\\sy\\test");
		delete(file);
		System.out.println("删除成功");

	}
	
	public static void delete(File file)
	{
		ArrayList<File> filelist=new ArrayList();
		ArrayList<File> dirList=new ArrayList();
		if(file.isFile())
		{
			file.delete();
		}
		filelist.add(file);//是文件夹就压栈
		while(filelist.size()>0)
		{
			File f=filelist.remove(0);//出队列
			File[] listFiles = f.listFiles();
			for (File file2 : listFiles)
			{
				if(file2.isFile())
				{
					file2.delete();
				}
				else
				{
					filelist.add(file2);//是文件夹就压栈
					dirList.add(file2);
				}
			}
		}
		//只剩空文件夹了
		System.out.println(dirList);
		System.out.println(dirList.size());
		for (int i=dirList.size()-1;i>=0;i--)
		{
			System.out.println(dirList.get(i)+"  "+i);
			dirList.get(i).delete();
		}
		System.out.println(dirList+"ddd");
		file.delete();
	}

}
