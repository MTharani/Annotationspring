package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class Vivo 
{
	@Autowired
  MobileProcessor cpu;

public MobileProcessor getCpu() {
	return cpu;
}

public void setCpu(MobileProcessor cpu) {
	this.cpu = cpu;
}
public void MobileConfig() {
	System.out.println("8gb Ram Dual Core 128px camera");
	cpu.processor();
}
}
