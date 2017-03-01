package myproxy;

/**
 * Created by Sveta_Medion on 01.03.2017.
 */
public class ClientProjectRUnner {
    public static void main(String[] args) {
        System.out.println();  /***/

   //     IProject iProject = new RealisationProject("https://github.com/Svetik77/balls_In_Box");
        /**вызовим теперь с помощью прокси класса что бы загружался проект как описано в его коментах*/
        IProject iProject = new ProxyProject("https://github.com/Svetik77/balls_In_Box");

        /**если запустить, увидим, что сначала скачивается проект, а потом запускается*/
        iProject.myrun();
    }

}
