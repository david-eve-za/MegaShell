/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaTextChat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaTextChat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaTextChat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaTextChat(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaTextChat copy() {
    long cPtr = megaJNI.MegaTextChat_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaTextChat(cPtr, false);
  }

  public long getHandle() {
    return megaJNI.MegaTextChat_getHandle(swigCPtr, this);
  }

  public int getOwnPrivilege() {
    return megaJNI.MegaTextChat_getOwnPrivilege(swigCPtr, this);
  }

  public int getShard() {
    return megaJNI.MegaTextChat_getShard(swigCPtr, this);
  }

  public MegaTextChatPeerList getPeerList() {
    long cPtr = megaJNI.MegaTextChat_getPeerList(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaTextChatPeerList(cPtr, false);
  }

  public void setPeerList(MegaTextChatPeerList peers) {
    megaJNI.MegaTextChat_setPeerList(swigCPtr, this, MegaTextChatPeerList.getCPtr(peers), peers);
  }

  public boolean isGroup() {
    return megaJNI.MegaTextChat_isGroup(swigCPtr, this);
  }

  public long getOriginatingUser() {
    return megaJNI.MegaTextChat_getOriginatingUser(swigCPtr, this);
  }

  public String getTitle() {
    return megaJNI.MegaTextChat_getTitle(swigCPtr, this);
  }

  public boolean hasChanged(int changeType) {
    return megaJNI.MegaTextChat_hasChanged(swigCPtr, this, changeType);
  }

  public int getChanges() {
    return megaJNI.MegaTextChat_getChanges(swigCPtr, this);
  }

  public int isOwnChange() {
    return megaJNI.MegaTextChat_isOwnChange(swigCPtr, this);
  }

  public long getCreationTime() {
    return megaJNI.MegaTextChat_getCreationTime(swigCPtr, this);
  }

  public MegaTextChat() {
    this(megaJNI.new_MegaTextChat(), true);
  }

  public final static int CHANGE_TYPE_ATTACHMENT = 0x01;

}
