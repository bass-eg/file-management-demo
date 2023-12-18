package Hibernatecustomizespringboot.Hibernatecustomize.controller;


import Hibernatecustomizespringboot.Hibernatecustomize.DynamicModelService;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


@RestController
public class UserController {

//	@Autowired
//	private UserServiceImpl userService;
    private final DynamicModelService dynamicModelService ;

    public UserController(DynamicModelService dynamicModelService) {
        this.dynamicModelService = dynamicModelService;
    }
//        dynamicModelService.test();

//	public void setUserService(UserServiceImpl userService) {
//		this.userService = userService;
//	}


//	@PostMapping("/save")
//	public User save(@RequestBody User user){
//		System.out.println(user.getName());
//		return userService.save(user);
//	}

	@GetMapping("/test")
	public void getAllUsers() {
        dynamicModelService.test();
//		return userService.getAllUsers();
	}

    @GetMapping("/test2")
    public void testFootball() {
        dynamicModelService.test();
//		return userService.getAllUsers();
    }

    @GetMapping("/test3")
    public void testCat() {
        dynamicModelService.test();
//		return userService.getAllUsers();
    }


    @GetMapping("/create/{tableName}")
    public void createTable(@PathVariable("tableName") String tableName) {
//        dynamicModelService.createTable(tableName);
    }
//	@GetMapping("/{id}")
//	public User getUser(@PathVariable(value="id")long id) {
//		return userService.getUser(id);
//	}
//
//	@PutMapping("/update/{id}")
//	public void updateUser(@RequestBody User updateUser,@PathVariable(value="id")long id) {
//		userService.updateUser(updateUser, id);
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteUser(@PathVariable(value="id")long id) {
//		 userService.deleteUser(id);
//	}
//
//	@GetMapping("/allUsersByCriteria")
//	public List<User> getAllUsersByCriteria() {
//		return userService.getAllUsersByCriteria();
//	}
//
//	@GetMapping("/name/{name}")
//	public List<User> getAllUsersByName(@PathVariable(value="name")String name) {
//		return userService.getAllUsersByName(name);
//	}

//    @GetMapping("/xml")
//    public void createXML(){
//
//        System.err.println("xml1");
//
//        //Root Element
//        Element root=new Element("CONFIGURATION");
//        Document doc=new Document();
////Element 1
//        Element child1=new Element("BROWSER");
////Element 1 Content
//        child1.addContent("chrome");
////Element 2
//        Element child2=new Element("BASE");
////Element 2 Content
//        child2.addContent("http:fut");
////Element 3
//        Element child3=new Element("EMPLOYEE");
////Element 3 --> In this case this element has another element with Content
//        child3.addContent(new Element("EMP_NAME").addContent("Anhorn, Irene"));
//
////Add it in the root Element
//        root.addContent(child1);
//        root.addContent(child2);
//        root.addContent(child3);
////Define root element like root
//        doc.setRootElement(root);
////Create the XML
//        XMLOutputter outter=new XMLOutputter();
//        outter.setFormat(Format.getPrettyFormat());
//        try {
//            outter.output(doc, new FileWriter(new File("./myxml.xml")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

}
