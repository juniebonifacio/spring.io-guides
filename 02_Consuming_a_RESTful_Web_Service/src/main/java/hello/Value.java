/**
 * 
 */
package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author Junie D. Bonifacio
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long id;
	private String quote;
	
}
