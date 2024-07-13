package com.blog.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
	@Id
	@GeneratedValue(generator="category_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="category_gen",sequenceName="post_seq",initialValue=1,allocationSize=1)
	private Integer categoryId;
	
	@Column(name="title",length=100 ,nullable =false)
	private String categoryTitle;
	
	@Column(name="description")
	private String categoryDiscription;
	
	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Post> posts = new ArrayList<>();
	

}
