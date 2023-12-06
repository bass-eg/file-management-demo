package Hibernatecustomizespringboot.Hibernatecustomize.controller;


import Hibernatecustomizespringboot.Hibernatecustomize.DynamicModelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


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

}
