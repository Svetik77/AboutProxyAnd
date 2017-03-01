package myproxy;

/**
 * Created by Sveta_Medion on 01.03.2017.
 */

/**а теперь Proxy, для чего? ЧТо бы загружать проекты не при создании проекта,
 * а только при запуске проекта:
 * когда мы еще только создадим обьект, мы еще не будем уже готового проекта
 * на локальном компе из github, сначала создадим проект , укажем сылку , а только
 * при запуске будем качать весь проект себе на комп
 * */
public class ProxyProject implements IProject {
    /**
     * сылка проекта который хотим скачать
     */
    private String url;

    /***/
    private RealisationProject realisationProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    /***/


    @Override
    public void myrun() {
        /**если проекта еще нету, то мы его создадим*/
        if(realisationProject == null) {
            realisationProject = new RealisationProject(url);
        }
        /**и только тогда вызовем запуск*/
        realisationProject.myrun();
    }
}
