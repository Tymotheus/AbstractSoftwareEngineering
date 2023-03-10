/**
 */
package javaProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaProgram.JavaProgram#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see javaProgram.JavaProgramPackage#getJavaProgram()
 * @model
 * @generated
 */
public interface JavaProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link javaProgram.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see javaProgram.JavaProgramPackage#getJavaProgram_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Type> getTypes();

} // JavaProgram
