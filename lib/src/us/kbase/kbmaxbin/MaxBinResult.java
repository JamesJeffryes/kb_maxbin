
package us.kbase.kbmaxbin;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: MaxBinResult</p>
 * <pre>
 * result_folder: folder path that holds all files generated by run_max_bin
 * report_name: report name generated by KBaseReport
 * report_ref: report reference generated by KBaseReport
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "result_directory",
    "binned_contig_obj_ref",
    "report_name",
    "report_ref"
})
public class MaxBinResult {

    @JsonProperty("result_directory")
    private String resultDirectory;
    @JsonProperty("binned_contig_obj_ref")
    private String binnedContigObjRef;
    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_ref")
    private String reportRef;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result_directory")
    public String getResultDirectory() {
        return resultDirectory;
    }

    @JsonProperty("result_directory")
    public void setResultDirectory(String resultDirectory) {
        this.resultDirectory = resultDirectory;
    }

    public MaxBinResult withResultDirectory(String resultDirectory) {
        this.resultDirectory = resultDirectory;
        return this;
    }

    @JsonProperty("binned_contig_obj_ref")
    public String getBinnedContigObjRef() {
        return binnedContigObjRef;
    }

    @JsonProperty("binned_contig_obj_ref")
    public void setBinnedContigObjRef(String binnedContigObjRef) {
        this.binnedContigObjRef = binnedContigObjRef;
    }

    public MaxBinResult withBinnedContigObjRef(String binnedContigObjRef) {
        this.binnedContigObjRef = binnedContigObjRef;
        return this;
    }

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public MaxBinResult withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_ref")
    public String getReportRef() {
        return reportRef;
    }

    @JsonProperty("report_ref")
    public void setReportRef(String reportRef) {
        this.reportRef = reportRef;
    }

    public MaxBinResult withReportRef(String reportRef) {
        this.reportRef = reportRef;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("MaxBinResult"+" [resultDirectory=")+ resultDirectory)+", binnedContigObjRef=")+ binnedContigObjRef)+", reportName=")+ reportName)+", reportRef=")+ reportRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
