/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaInputStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaInputStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaInputStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaInputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
}

  public long getSize() {
    return megaJNI.MegaInputStream_getSize(swigCPtr, this);
  }

  public boolean read(byte[] buffer) {
    return megaJNI.MegaInputStream_read(swigCPtr, this, buffer);
  }

  public MegaInputStream() {
    this(megaJNI.new_MegaInputStream(), true);
  }

}
