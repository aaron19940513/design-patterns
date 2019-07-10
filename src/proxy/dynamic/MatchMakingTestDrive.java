package proxy.dynamic;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
    }

    private void drive() {
        PersonBean jordan = getPersonFromDataBase("Jordan");
        PersonBean ownerProxy = getOwnerProxy(jordan);
        System.out.println(ownerProxy.getName());
        ownerProxy.setInterests("basketball");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println(ownerProxy.getHorOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(jordan);
        System.out.println(nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("basketball");
        } catch (Exception e) {
            System.out.println("Can't set interests from nonOwner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(888);
        System.out.println("Rating is :" + nonOwnerProxy.getHorOrNotRating());

    }


    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }

    private PersonBean getPersonFromDataBase(String jorDan) {
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("Jordan");
        personBean.setGender("male");
        personBean.setInterests("NBA");
        personBean.setHotOrNotRating(999);
        return personBean;
    }
}
