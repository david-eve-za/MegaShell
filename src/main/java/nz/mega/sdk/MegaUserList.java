/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaUserList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaUserList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaUserList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaUserList(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaUserList copy() {
    long cPtr = megaJNI.MegaUserList_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaUserList(cPtr, true);
  }

  public MegaUser get(int i) {
    long cPtr = megaJNI.MegaUserList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new MegaUser(cPtr, false);
  }

  public int size() {
    return megaJNI.MegaUserList_size(swigCPtr, this);
  }

  public MegaUserList() {
    this(megaJNI.new_MegaUserList(), true);
  }

}
