package test;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Helloworld {

	public static void main(String[] args) {
		//ファイルリスト取得
		List<String> fileList = getFileList("C:\\Users\\itome\\Downloads");

		makeLogger makeLogger = new makeLogger();
		Path path = makeLogger.makingLogFile();
		makeLogger.writeFile(path,fileList);
	}

	/**
	 * <pre>
	 * 指定したファイルパスのファイルリストを取得する。
	 * </pre>
	 * @param filepath ファイルパス
	 * @return  fileList ファイルパスから取得したファイルのリスト
	 */
	private static List<String> getFileList(String filepath)
	{
        //ファイル名の一覧を取得する
        File file = new File(filepath);
        File files[] = file.listFiles();
        List<String> fileList = new ArrayList<String>();

        //取得した一覧をリストに追加する。
        for (int i=0; i<files.length; i++) {
            fileList.add(files[i].getName());
        }
        return fileList;
	}
}
