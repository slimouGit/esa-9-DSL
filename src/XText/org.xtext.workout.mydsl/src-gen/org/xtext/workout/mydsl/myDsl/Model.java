/**
 * generated by Xtext 2.25.0
 */
package org.xtext.workout.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.workout.mydsl.myDsl.Model#getWorkout <em>Workout</em>}</li>
 * </ul>
 *
 * @see org.xtext.workout.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Workout</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workout</em>' attribute list.
   * @see org.xtext.workout.mydsl.myDsl.MyDslPackage#getModel_Workout()
   * @model unique="false"
   * @generated
   */
  EList<String> getWorkout();

} // Model
