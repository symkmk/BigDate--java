package sy180920;

/**
 * @author suyuan
 *乐器类
 *发出声音
 */
public class Musical
{
	public Musical()
	{
		super();
	}


	public void show()
	{
		System.out.println("发出声音"); 
	}

	public Musical(String voice)
	{
		super();
		this.voice = voice;
	}

	public String getVoice()
	{
		return voice;
	}

	public void setVoice(String voice)
	{
		this.voice = voice;
	}

	private String voice;

}
