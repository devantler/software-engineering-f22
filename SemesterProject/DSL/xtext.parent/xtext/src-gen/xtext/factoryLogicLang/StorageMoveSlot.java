/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLogicLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Move Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLogicLang.StorageMoveSlot#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLogicLang.StorageMoveSlot#getPosition <em>Position</em>}</li>
 *   <li>{@link xtext.factoryLogicLang.StorageMoveSlot#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getStorageMoveSlot()
 * @model
 * @generated
 */
public interface StorageMoveSlot extends Operation
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Storage)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getStorageMoveSlot_Device()
   * @model
   * @generated
   */
  Storage getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.StorageMoveSlot#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Storage value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' reference.
   * @see #setPosition(StoragePositionParameter)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getStorageMoveSlot_Position()
   * @model
   * @generated
   */
  StoragePositionParameter getPosition();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.StorageMoveSlot#getPosition <em>Position</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(StoragePositionParameter value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(StoragePositionParameter)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getStorageMoveSlot_Destination()
   * @model
   * @generated
   */
  StoragePositionParameter getDestination();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.StorageMoveSlot#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(StoragePositionParameter value);

} // StorageMoveSlot