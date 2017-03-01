package myproxy;

/**
 * Created by Sveta_Medion on 01.03.2017.
 */
public class RealisationProject implements IProject {
    /**
     * сылка проекта который хотим скачать
     */
    private String url;

    /**сылка на закачку и сразу закачмваем проект по сылке
     * потому что что бы запустить наш проект, его нужно сначала скачать */
    public RealisationProject(String url) {
        this.url = url;
        myLoad();
    }

    /**
     * метод который будет скачивать наш проект наприм из githzb по сылке url
     */
    public void myLoad() {
        System.out.println("скачиваем сначала : Loading project from " + url + "...");

    }

    /***/

    @Override
    public void myrun() {
        System.out.println("а теперь он запущен : Running my project " + url + "...");
    }
}
