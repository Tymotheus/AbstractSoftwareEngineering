/**
 */
package javaProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaProgram.JavaClass#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see javaProgram.JavaProgramPackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends Type {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link javaProgram.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see javaProgram.JavaProgramPackage#getJavaClass_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getFields();

} // JavaClass
