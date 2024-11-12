public interface IDatabase {
    void add();

    void delete();

    void get();

    void update();

}



class DatabaseManager
{
    public void addDatabase(IDatabase database)
    {
        database.add();
    }
    public void deleteDatabase(IDatabase database)
    {
        database.delete();
    }
    public void updateDatabase(IDatabase database)
    {
        database.update();
    }
    public void getDatabase(IDatabase database)
    {
        database.get();
    }

}
public class OracleDatabase implements IDatabase{
    @Override
    public void add()
    {
        System.out.println("OracleDatabase add");
    }

    @Override
    public void delete()
    {
        System.out.println("OracleDatabase delete");
    }

    @Override
    public void get()
    {
        System.out.println("OracleDatabase get");
    }

    @Override
    public void update()
    {
        System.out.println("OracleDatabase update");
    }


}
public class MysqlDatabase implements IDatabase{
    @Override
    public void add()
    {
        System.out.println("MysqlDatabase add");
    }

    @Override
    public void delete()
    {
        System.out.println("MysqlDatabase delete");
    }

    @Override
    public void get()
    {
        System.out.println("MysqlDatabase get");
    }

    @Override
    public void update()
    {
        System.out.println("MysqlDatabase update");
    }

}
public class MongoDatabase implements IDatabase{
    @Override
    public void add()
    {
        System.out.println("MongoDatabase add");
    }

    @Override
    public void delete()
    {
        System.out.println("MongoDatabase delete");
    }

    @Override
    public void get()
    {
        System.out.println("MongoDatabase get");
    }

    @Override
    public void update()
    {
        System.out.println("MongoDatabase update");
    }


}


public class Main{
    public static void main(String[] args)
    {
        DatabaseManager manager=new DatabaseManager();
        manager.addDatabase(new MysqlDatabase());
        manager.addDatabase(new OracleDatabase());
    }
}
