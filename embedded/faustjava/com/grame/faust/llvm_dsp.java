/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.grame.faust;

public class llvm_dsp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected llvm_dsp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(llvm_dsp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FaustJNI.delete_llvm_dsp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public llvm_dsp() {
    this(FaustJNI.new_llvm_dsp(), true);
  }

}
