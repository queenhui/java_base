package com.diqizhang;

import java.io.Serializable;

public class Person implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int id;
		private String name;
		private int age;
		private void name() {
			
		}
		public Person(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		public Person() {
			super();
			// TODO 自动生成的构造函数存根
		}
		public Person(int i, String string) {
			// TODO 自动生成的构造函数存根
		}
		
}

