import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	public Student[] students;
	private int size=0;
	

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException("Illegl index");
		}
		else {
			return this.students;
		
		}
		
	
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		if(students==null) {
			throw new IllegalArgumentException("Illegl index");
		}
		else {
			int len = students.length;
			
				for(int i=0;i<len;i++) {
					this.setStudent(students[i], i);
					
				}
				this.setSize(len);	
			
			
		
		}
	}
	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(this.students==null  ) {
			throw new IllegalArgumentException();
		}
		else if(index <0 || index >=this.students.length ){
			throw new IllegalArgumentException();
			
		
		}else {
			return this.students[index];
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException();
		}
		else if(index <0 || index >=this.students.length ){
			throw new IllegalArgumentException();
			
		
		}else {
			this.students[index]=student;
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException();
		}
		else if(this.students.length==this.getSize()){
			throw new IllegalArgumentException();
			
		}
		else {
			Student temp=student;
			Student pick;		
			int siz=this.getSize();
			for(int i=0;i<siz+1;i++) {
				pick=this.getStudent(i);
				this.setStudent(temp, i);
				temp=pick;
			}
			this.setSize(siz+1);
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException();
		}
		else if(this.students.length==this.getSize()){
			throw new IllegalArgumentException();
			
		}
		else {
			Student temp=student;
			int siz=this.getSize();
			//System.out.println("size is "+siz);
			this.setStudent(student, siz);
			this.setSize(siz+1);
		}
	}

	@Override
	public void add(Student student, int index) {
		
		// Add your implementation here
		if(this.students==null || index <0 || index >=this.students.length ) {
			throw new IllegalArgumentException();
		}
		else if(this.students.length==this.getSize()){
			throw new IllegalArgumentException();
			
		}
		else {
			Student temp=student;
			Student pick;		
			int siz=this.getSize();
			for(int i=index;i<siz+1;i++) {
				pick=this.getStudent(i);
				this.setStudent(temp, i);
				temp=pick;
			}
			this.setSize(siz+1);
		}
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException();
		}
		else if(index <0 || index >=this.students.length ){
			throw new IllegalArgumentException();
			
		
		}else {
			int siz=this.getSize();
			for(int i=index;i<siz;i++) {
				this.setStudent(this.getStudent(i+1), i);
			}
			this.setStudent(null, siz);
			this.setSize(siz-1);
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(this.students==null) {
			throw new IllegalArgumentException();
		}
		else {
			Student temp=student;
			int siz=this.getSize(),flag=0;
			for(int i=0;i<this.students.length;i++) {
				if(temp==this.getStudent(i)) {
					this.remove(i);
					flag=1;
					break;
				}
			}
			if(flag==0) {
				throw new IllegalArgumentException("Student not exist");
			}
		}
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
