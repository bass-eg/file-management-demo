package Hibernatecustomizespringboot.Hibernatecustomize;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.*;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
public class DynamicModelService {
    @Autowired
    private SessionFactory sessionFactory;
    private Configuration configuration;
//    public void createTable(String name) {
//        Mappings mappings = configuration.createMappings();
//
//        Table table = mappings.addTable(null, null, name, null, false);
//        Column column = new Column();
//        column.setName("value");
//        //column.setSqlTypeCode(1);
//        column.setSqlType("VARCHAR(256)");
//
//        table.addColumn(column);
//        mappings.addColumnBinding("value", column, table);
//
//
//        RootClass rootClass = new RootClass();
//        rootClass.setEntityName(name);
//        rootClass.setJpaEntityName(name);
//
//        Property property = new Property();
//        property.setName("value");
//
//        rootClass.addProperty(property);
//
//        KeyValue keyValue = new SimpleValue(mappings);
//        rootClass.setIdentifier(keyValue);
//
//        mappings.addClass(rootClass);
//
//        new SchemaExport(configuration).create(false, true);
//
//        System.out.println(name);
//
//    }
    public void test() {
        Session s = this.sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        Map<String, Object> david = new HashMap<>();
        david.put("name", "David");
        Map<String, Object> mostafa = new HashMap<>();
        mostafa.put("name", "Mostafa");
        s.save("Dog",david);
        s.save("Dog",mostafa);
        tx.commit();
        s.close();
    }

}