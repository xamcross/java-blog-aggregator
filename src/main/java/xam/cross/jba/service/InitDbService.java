package xam.cross.jba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xam.cross.jba.entity.Blog;
import xam.cross.jba.entity.Item;
import xam.cross.jba.entity.Role;
import xam.cross.jba.entity.User;
import xam.cross.jba.repository.BlogRepository;
import xam.cross.jba.repository.ItemRepository;
import xam.cross.jba.repository.RoleRepository;
import xam.cross.jba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@PostConstruct
	public void init(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("ADMIN");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogCosy = new Blog();
		blogCosy.setName("Cosy Blog");
		blogCosy.setUrl("http://feeds.feedburner.com/javavids?format=xml");
		blogCosy.setUser(userAdmin);
		blogRepository.save(blogCosy);
		
		Item itemOne = new Item();
		itemOne.setTitle("One");
		itemOne.setBlog(blogCosy);
		itemOne.setLink("http://www.javavids.com");
		itemOne.setPublishedDate(new Date());
		itemRepository.save(itemOne);
		
		Item itemTwo = new Item();
		itemTwo.setTitle("Two");
		itemTwo.setBlog(blogCosy);
		itemTwo.setLink("http://www.javavids.com");
		itemTwo.setPublishedDate(new Date());
		itemRepository.save(itemTwo);
		
		Item itemThree = new Item();
		itemThree.setTitle("Three");
		itemThree.setBlog(blogCosy);
		itemThree.setLink("http://www.javavids.com");
		itemThree.setPublishedDate(new Date());
		itemRepository.save(itemThree);
	}
	
}
