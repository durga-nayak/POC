import com.algo.analysis.linkedlist.ds.BinarySearchTree;

/**
 * 
 */

/**
 * @author Lali
 *
 */
public class TestAlgo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		class Employee implements Comparable<Employee>{
			int age;
			int empId;

			@Override
			public String toString() {
				return "Employee [age=" + age + ", empId=" + empId + "]";
			}

			@Override
			public int compareTo(Employee o) {
				if (this.empId > o.empId){
					return 1;
				}else if (this.empId < o.empId){
					return -1;
				}
				return 0;
			}
		}
		// TODO Auto-generated method stub
		BinarySearchTree<Employee> binarySearchTree = new BinarySearchTree<Employee>();
		Integer[] empId = {3,9,1,2,5,4,0,12,13,14};
		for (int i=0; i < empId.length; i++){
			Employee employee = new Employee();
			employee.empId = empId[i];
			employee.age = 20+i;
			binarySearchTree.insert(employee);
//			System.out.println(i);
		}
		
		System.out.println(binarySearchTree.getSize());
		System.out.println("+++++++++++++++++++++++++++++++++");
		Employee employee = new Employee();
		employee.empId =9;
		System.out.println(binarySearchTree.search(employee));
	}

}
