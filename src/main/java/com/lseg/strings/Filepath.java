package com.lseg.strings;

/**
 * /home/ionut/workspace/LSEG/algorithms/files/textFile.txt
 */
public class Filepath {

    private String fullPath;

    private String separator;

    private String extensionSeparator; //.

    public Filepath(String fullPath, String separator, String extensionSeparator) {
        this.fullPath = fullPath;
        this.separator = separator;
        this.extensionSeparator = extensionSeparator;
    }

    public String fileName() {
        int lastSepIndex = fullPath.lastIndexOf(separator);
        int extensionSeparatorIndex = fullPath.indexOf(extensionSeparator);
        return fullPath.substring(lastSepIndex + 1, extensionSeparatorIndex);
    }

    public String extension() {
        int extensionSeparatorIndex = fullPath.indexOf(extensionSeparator);
        return fullPath.substring(extensionSeparatorIndex + 1);
    }

}
