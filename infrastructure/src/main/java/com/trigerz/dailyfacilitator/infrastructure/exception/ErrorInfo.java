package com.trigerz.dailyfacilitator.infrastructure.exception;
import jdk.jfr.StackTrace;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

public class ErrorInfo {

	public final Date date;
	public final String url;
	public final String ex;

	public ErrorInfo(String url, Exception ex) {
		this.date = new Date();
		this.url = url;
		this.ex = ex.getLocalizedMessage();
	}
}

