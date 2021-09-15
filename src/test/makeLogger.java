package test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class makeLogger {

	public Path makingLogFile()
	{
        //Calendarクラスのオブジェクトを生成する
        Calendar cl = Calendar.getInstance();
        //SimpleDateFormatクラスでフォーマットパターンを設定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSSS");
		String timeText = sdf.format(cl.getTime());

		Path p = Paths.get("C:/Users/itome/Downloads/fileExport"+timeText+".log");
		try {
			Files.createFile(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	public void writeFile(Path p,List<String> fileList)
	{
		try
		{
			FileWriter filewriter = new FileWriter(p.toFile());
	        //取得した一覧を表示する
	        for (int i=0; i<fileList.size(); i++)
	        {
	        	filewriter.write("ファイル" + (i+1) + "→" + fileList.get(i)+"\r\n");
	        }
	        filewriter.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
