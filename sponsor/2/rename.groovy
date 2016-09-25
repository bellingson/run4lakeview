#!/usr/bin/env groovy

File dir = new File('.')

File [] files = dir.listFiles();

files.each { f ->

	String name = f.name.replaceAll(' ','_').replaceAll('\'','').replaceAll('-','_').toLowerCase();

	File f2 = new File(name);
	f.renameTo(f2);


}

println "hello"