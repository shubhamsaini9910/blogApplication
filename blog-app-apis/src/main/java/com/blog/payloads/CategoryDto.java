package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank
	@Size(min = 4, message="min size of category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10 , message = "Min size of category desc is 10")
	private String  categoryDiscription;

}
