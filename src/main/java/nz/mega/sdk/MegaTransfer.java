/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaTransfer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaTransfer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaTransfer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaTransfer(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaTransfer copy() {
    long cPtr = megaJNI.MegaTransfer_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaTransfer(cPtr, true);
  }

  public int getType() {
    return megaJNI.MegaTransfer_getType(swigCPtr, this);
  }

  public String getTransferString() {
    return megaJNI.MegaTransfer_getTransferString(swigCPtr, this);
  }

  public String toString() {
    return megaJNI.MegaTransfer_toString(swigCPtr, this);
  }

  public String __str__() {
    return megaJNI.MegaTransfer___str__(swigCPtr, this);
  }

  public String __toString() {
    return megaJNI.MegaTransfer___toString(swigCPtr, this);
  }

  public long getStartTime() {
    return megaJNI.MegaTransfer_getStartTime(swigCPtr, this);
  }

  public long getTransferredBytes() {
    return megaJNI.MegaTransfer_getTransferredBytes(swigCPtr, this);
  }

  public long getTotalBytes() {
    return megaJNI.MegaTransfer_getTotalBytes(swigCPtr, this);
  }

  public String getPath() {
    return megaJNI.MegaTransfer_getPath(swigCPtr, this);
  }

  public String getParentPath() {
    return megaJNI.MegaTransfer_getParentPath(swigCPtr, this);
  }

  public long getNodeHandle() {
    return megaJNI.MegaTransfer_getNodeHandle(swigCPtr, this);
  }

  public long getParentHandle() {
    return megaJNI.MegaTransfer_getParentHandle(swigCPtr, this);
  }

  public long getStartPos() {
    return megaJNI.MegaTransfer_getStartPos(swigCPtr, this);
  }

  public long getEndPos() {
    return megaJNI.MegaTransfer_getEndPos(swigCPtr, this);
  }

  public String getFileName() {
    return megaJNI.MegaTransfer_getFileName(swigCPtr, this);
  }

  public int getNumRetry() {
    return megaJNI.MegaTransfer_getNumRetry(swigCPtr, this);
  }

  public int getMaxRetries() {
    return megaJNI.MegaTransfer_getMaxRetries(swigCPtr, this);
  }

  public int getTag() {
    return megaJNI.MegaTransfer_getTag(swigCPtr, this);
  }

  public long getSpeed() {
    return megaJNI.MegaTransfer_getSpeed(swigCPtr, this);
  }

  public long getMeanSpeed() {
    return megaJNI.MegaTransfer_getMeanSpeed(swigCPtr, this);
  }

  public long getDeltaSize() {
    return megaJNI.MegaTransfer_getDeltaSize(swigCPtr, this);
  }

  public long getUpdateTime() {
    return megaJNI.MegaTransfer_getUpdateTime(swigCPtr, this);
  }

  public MegaNode getPublicMegaNode() {
    long cPtr = megaJNI.MegaTransfer_getPublicMegaNode(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaNode(cPtr, true);
  }

  public boolean isSyncTransfer() {
    return megaJNI.MegaTransfer_isSyncTransfer(swigCPtr, this);
  }

  public boolean isStreamingTransfer() {
    return megaJNI.MegaTransfer_isStreamingTransfer(swigCPtr, this);
  }

  public String getLastBytes() {
    return megaJNI.MegaTransfer_getLastBytes(swigCPtr, this);
  }

  public boolean isFolderTransfer() {
    return megaJNI.MegaTransfer_isFolderTransfer(swigCPtr, this);
  }

  public int getFolderTransferTag() {
    return megaJNI.MegaTransfer_getFolderTransferTag(swigCPtr, this);
  }

  public String getAppData() {
    return megaJNI.MegaTransfer_getAppData(swigCPtr, this);
  }

  public int getState() {
    return megaJNI.MegaTransfer_getState(swigCPtr, this);
  }

  public java.math.BigInteger getPriority() {
    return megaJNI.MegaTransfer_getPriority(swigCPtr, this);
  }

  public long getNotificationNumber() {
    return megaJNI.MegaTransfer_getNotificationNumber(swigCPtr, this);
  }

  public MegaTransfer() {
    this(megaJNI.new_MegaTransfer(), true);
  }

  public final static int TYPE_DOWNLOAD = 0;
  public final static int TYPE_UPLOAD = TYPE_DOWNLOAD + 1;
  public final static int TYPE_LOCAL_HTTP_DOWNLOAD = TYPE_UPLOAD + 1;

  public final static int STATE_NONE = 0;
  public final static int STATE_QUEUED = STATE_NONE + 1;
  public final static int STATE_ACTIVE = STATE_QUEUED + 1;
  public final static int STATE_PAUSED = STATE_ACTIVE + 1;
  public final static int STATE_RETRYING = STATE_PAUSED + 1;
  public final static int STATE_COMPLETING = STATE_RETRYING + 1;
  public final static int STATE_COMPLETED = STATE_COMPLETING + 1;
  public final static int STATE_CANCELLED = STATE_COMPLETED + 1;
  public final static int STATE_FAILED = STATE_CANCELLED + 1;

  public final static int MOVE_TYPE_UP = 1;
  public final static int MOVE_TYPE_DOWN = MOVE_TYPE_UP + 1;
  public final static int MOVE_TYPE_TOP = MOVE_TYPE_DOWN + 1;
  public final static int MOVE_TYPE_BOTTOM = MOVE_TYPE_TOP + 1;

}
