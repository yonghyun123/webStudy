package kr.or.connect.guestbook.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Guestbook {
	private Long id;
	private String name;
	private String content;
	private Date regDate;
}
