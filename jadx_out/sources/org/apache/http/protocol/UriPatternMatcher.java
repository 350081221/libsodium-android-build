package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.d;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class UriPatternMatcher {
    private final Map handlerMap = new HashMap();

    public void register(String pattern, Object handler) {
        if (pattern == null) {
            throw new IllegalArgumentException("URI request pattern may not be null");
        }
        if (handler == null) {
            throw new IllegalArgumentException("HTTP request handelr may not be null");
        }
        this.handlerMap.put(pattern, handler);
    }

    public void unregister(String pattern) {
        if (pattern == null) {
            return;
        }
        this.handlerMap.remove(pattern);
    }

    public void setHandlers(Map map) {
        if (map == null) {
            throw new IllegalArgumentException("Map of handlers may not be null");
        }
        this.handlerMap.clear();
        this.handlerMap.putAll(map);
    }

    public Object lookup(String requestURI) {
        if (requestURI == null) {
            throw new IllegalArgumentException("Request URI may not be null");
        }
        int index = requestURI.indexOf("?");
        if (index != -1) {
            requestURI = requestURI.substring(0, index);
        }
        Object handler = this.handlerMap.get(requestURI);
        if (handler == null) {
            String bestMatch = null;
            for (String pattern : this.handlerMap.keySet()) {
                if (matchUriRequestPattern(pattern, requestURI) && (bestMatch == null || bestMatch.length() < pattern.length() || (bestMatch.length() == pattern.length() && pattern.endsWith(d.ANY_MARKER)))) {
                    handler = this.handlerMap.get(pattern);
                    bestMatch = pattern;
                }
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean matchUriRequestPattern(String pattern, String requestUri) {
        if (pattern.equals(d.ANY_MARKER)) {
            return true;
        }
        if (pattern.endsWith(d.ANY_MARKER) && requestUri.startsWith(pattern.substring(0, pattern.length() - 1))) {
            return true;
        }
        return pattern.startsWith(d.ANY_MARKER) && requestUri.endsWith(pattern.substring(1, pattern.length()));
    }
}
