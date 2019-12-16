package io.anuke.arc.backends.teavm;

import io.anuke.arc.*;
import io.anuke.arc.files.*;
import io.anuke.arc.util.*;
import org.teavm.jso.browser.*;

public class TeaFiles implements Files{
    public static final Storage localStorage = Storage.getLocalStorage();

    @Override
    public Fi get(String path, FileType type){
        if(type != FileType.internal){
            throw new ArcRuntimeException("FileType '" + type + "' not supported in TeaVM backend");
        }
        return new TeaFi(path, type);
    }

    @Override
    public String getExternalStoragePath(){
        return null;
    }

    @Override
    public boolean isExternalStorageAvailable(){
        return false;
    }

    @Override
    public String getLocalStoragePath(){
        return null;
    }

    @Override
    public boolean isLocalStorageAvailable(){
        return false;
    }
}
