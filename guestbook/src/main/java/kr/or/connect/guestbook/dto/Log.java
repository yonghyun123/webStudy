package kr.or.connect.guestbook.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Log {
	private Long id;
	private String ip;
	private String method;
	private Date regDate;
}
