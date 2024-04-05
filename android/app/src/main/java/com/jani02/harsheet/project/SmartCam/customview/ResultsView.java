

package com.jani02.harsheet.project.SmartCam.customview;

import java.util.List;
import com.jani02.harsheet.project.SmartCam.tflite.Detector.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
