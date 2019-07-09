package observer.headfirst;



/**
 * @author sam
 * @date 2019/7/5 15:07
 */
public interface Subject {
     void registerObserver(Observer observer);

     void removeObserver(Observer observer);

     public void notifyObservers();

}
