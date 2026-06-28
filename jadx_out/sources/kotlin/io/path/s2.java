package kotlin.io.path;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.v2;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\r\u00102\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u00103\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a.\u0010;\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010=\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010>\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a\u0015\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0087\b\u001a-\u0010@\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010<\u001a6\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010C\u001a\u000200*\u00020\u0002H\u0087\b\u001a\r\u0010D\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001H\u0087\n\u001a&\u0010G\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010J\u001a\u0002HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a4\u0010N\u001a\u0004\u0018\u0001HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a\r\u0010O\u001a\u00020P*\u00020\u0002H\u0087\b\u001a\r\u0010Q\u001a\u00020R*\u00020\u0002H\u0087\b\u001a.\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002000.H\u0087\bø\u0001\u0000\u001a0\u0010V\u001a\u0004\u0018\u00010W*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010Y\u001a&\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010\\\u001a(\u0010]\u001a\u0004\u0018\u00010^*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010_\u001a,\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010c\u001a&\u0010d\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\r\u0010e\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010f\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010g\u001a\u00020:*\u00020\u0002H\u0087\b\u001a&\u0010h\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\u0015\u0010i\u001a\u00020:*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\b\u001a\r\u0010j\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010k\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020m*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0007\u001a.\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a&\u0010o\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010p\u001a\u0002Hq\"\n\b\u0000\u0010q\u0018\u0001*\u00020r*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010s\u001a<\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010W0t*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010u\u001a\r\u0010v\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010x\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\b\u0010{\u001a\u0004\u0018\u00010W2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010|\u001a\u0015\u0010}\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020[H\u0087\b\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020^H\u0087\b\u001a\u001b\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\f\u0010{\u001a\b\u0012\u0004\u0012\u00020b0aH\u0087\b\u001a\u000f\u0010\u0080\u0001\u001a\u00020\u0002*\u00030\u0081\u0001H\u0087\b\u001aF\u0010\u0082\u0001\u001a\u0003H\u0083\u0001\"\u0005\b\u0000\u0010\u0083\u0001*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u001b\u0010\u0084\u0001\u001a\u0016\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001\u0012\u0005\u0012\u0003H\u0083\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0086\u0001\u001a3\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020,2\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:H\u0007\u001aJ\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a0\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001*\u00020\u00022\u0014\u00106\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008d\u00010\u001a\"\u00030\u008d\u0001H\u0007¢\u0006\u0003\u0010\u008e\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", ClientCookie.PATH_ATTR, "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "fileVisitor", "Ljava/nio/file/FileVisitor;", "builderAction", "Lkotlin/Function1;", "Lkotlin/io/path/FileVisitorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "absolute", "absolutePathString", "copyTo", TypedValues.AttributesType.S_TARGET, "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createParentDirectories", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", t0.b.f22420d, "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitFileTree", "visitor", "maxDepth", "", "followLinks", "walk", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
/* loaded from: classes4.dex */
public class s2 extends l1 {
    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean A0(Path path, LinkOption... options) {
        boolean exists;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return exists;
    }

    @kotlin.g1(version = "1.7")
    @o
    public static final void A1(@p4.l Path path, int i5, boolean z4, @p4.l v3.l<? super p, kotlin.r2> builderAction) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        B1(path, G0(builderAction), i5, z4);
    }

    @p4.l
    @kotlin.a1
    public static final Void B0(@p4.l Path path, @p4.l Class<?> attributeViewClass) {
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + external.org.apache.commons.lang3.d.f15957a);
    }

    @kotlin.g1(version = "1.7")
    @o
    public static final void B1(@p4.l Path path, @p4.l FileVisitor<Path> visitor, int i5, boolean z4) {
        Set k5;
        FileVisitOption fileVisitOption;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(visitor, "visitor");
        if (z4) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            k5 = kotlin.collections.k1.f(fileVisitOption);
        } else {
            k5 = kotlin.collections.l1.k();
        }
        Files.walkFileTree(path, k5, i5, visitor);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final /* synthetic */ <V extends FileAttributeView> V C0(Path path, LinkOption... options) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        kotlin.jvm.internal.l0.y(4, "V");
        fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        V v4 = (V) fileAttributeView;
        if (v4 != null) {
            return v4;
        }
        kotlin.jvm.internal.l0.y(4, "V");
        B0(path, FileAttributeView.class);
        throw new kotlin.y();
    }

    public static /* synthetic */ void C1(Path path, int i5, boolean z4, v3.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        A1(path, i5, z4, lVar);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final /* synthetic */ <V extends FileAttributeView> V D0(Path path, LinkOption... options) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        kotlin.jvm.internal.l0.y(4, "V");
        fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        return (V) fileAttributeView;
    }

    public static /* synthetic */ void D1(Path path, FileVisitor fileVisitor, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        B1(path, fileVisitor, i5, z4);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final long E0(Path path) throws IOException {
        long size;
        kotlin.jvm.internal.l0.p(path, "<this>");
        size = Files.size(path);
        return size;
    }

    @p4.l
    @kotlin.g1(version = "1.7")
    @o
    public static final kotlin.sequences.m<Path> E1(@p4.l Path path, @p4.l j0... options) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        return new f0(path, options);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final FileStore F0(Path path) throws IOException {
        FileStore fileStore;
        kotlin.jvm.internal.l0.p(path, "<this>");
        fileStore = Files.getFileStore(path);
        kotlin.jvm.internal.l0.o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @p4.l
    @kotlin.g1(version = "1.7")
    @o
    public static final FileVisitor<Path> G0(@p4.l v3.l<? super p, kotlin.r2> builderAction) {
        kotlin.jvm.internal.l0.p(builderAction, "builderAction");
        q qVar = new q();
        builderAction.invoke(qVar);
        return qVar.e();
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final void H0(Path path, String glob, v3.l<? super Path, kotlin.r2> action) throws IOException {
        DirectoryStream it;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(glob, "glob");
        kotlin.jvm.internal.l0.p(action, "action");
        it = Files.newDirectoryStream(path, glob);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
        } finally {
        }
    }

    static /* synthetic */ void I0(Path path, String glob, v3.l action, int i5, Object obj) throws IOException {
        DirectoryStream it;
        if ((i5 & 1) != 0) {
            glob = org.slf4j.d.ANY_MARKER;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(glob, "glob");
        kotlin.jvm.internal.l0.p(action, "action");
        it = Files.newDirectoryStream(path, glob);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                action.invoke(it2.next());
            }
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
        } finally {
        }
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Object J0(Path path, String attribute, LinkOption... options) throws IOException {
        Object attribute2;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attribute, "attribute");
        kotlin.jvm.internal.l0.p(options, "options");
        attribute2 = Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
        return attribute2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r2 = kotlin.text.f0.o5(r2, external.org.apache.commons.lang3.d.f15957a, "");
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String K0(@p4.l java.nio.file.Path r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.nio.file.Path r2 = kotlin.io.path.l.a(r2)
            java.lang.String r0 = ""
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            r1 = 46
            java.lang.String r2 = kotlin.text.v.o5(r2, r1, r0)
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.s2.K0(java.nio.file.Path):java.lang.String");
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static /* synthetic */ void L0(Path path) {
    }

    private static final String M0(Path path) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        return O0(path);
    }

    @kotlin.g1(version = "1.4")
    @kotlin.k(level = kotlin.m.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.b1(expression = "invariantSeparatorsPathString", imports = {}))
    @kotlin.internal.f
    @o
    public static /* synthetic */ void N0(Path path) {
    }

    @p4.l
    public static final String O0(@p4.l Path path) {
        FileSystem fileSystem;
        String separator;
        String i22;
        kotlin.jvm.internal.l0.p(path, "<this>");
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        if (!kotlin.jvm.internal.l0.g(separator, "/")) {
            String obj = path.toString();
            kotlin.jvm.internal.l0.o(separator, "separator");
            i22 = kotlin.text.e0.i2(obj, separator, "/", false, 4, null);
            return i22;
        }
        return path.toString();
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static /* synthetic */ void P0(Path path) {
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final FileTime Q0(Path path, LinkOption... options) throws IOException {
        FileTime lastModifiedTime;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @p4.l
    public static final String R0(@p4.l Path path) {
        Path fileName;
        String str;
        kotlin.jvm.internal.l0.p(path, "<this>");
        fileName = path.getFileName();
        if (fileName != null) {
            str = fileName.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static /* synthetic */ void S0(Path path) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r3 = kotlin.text.f0.z5(r3, ".", null, 2, null);
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T0(@p4.l java.nio.file.Path r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.nio.file.Path r3 = kotlin.io.path.l.a(r3)
            if (r3 == 0) goto L1b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1b
            java.lang.String r0 = "."
            r1 = 2
            r2 = 0
            java.lang.String r3 = kotlin.text.v.z5(r3, r0, r2, r1, r2)
            if (r3 != 0) goto L1d
        L1b:
            java.lang.String r3 = ""
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.s2.T0(java.nio.file.Path):java.lang.String");
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static /* synthetic */ void U0(Path path) {
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final UserPrincipal V0(Path path, LinkOption... options) throws IOException {
        UserPrincipal owner;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        owner = Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return owner;
    }

    private static final String W0(Path path) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        return path.toString();
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    public static /* synthetic */ void X0(Path path) {
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Set<PosixFilePermission> Y0(Path path, LinkOption... options) throws IOException {
        Set<PosixFilePermission> posixFilePermissions;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean Z0(Path path, LinkOption... options) {
        boolean isDirectory;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return isDirectory;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean a1(Path path) {
        boolean isExecutable;
        kotlin.jvm.internal.l0.p(path, "<this>");
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path b0(String path) {
        Path path2;
        kotlin.jvm.internal.l0.p(path, "path");
        path2 = Paths.get(path, new String[0]);
        kotlin.jvm.internal.l0.o(path2, "get(path)");
        return path2;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean b1(Path path) throws IOException {
        boolean isHidden;
        kotlin.jvm.internal.l0.p(path, "<this>");
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path c0(String base, String... subpaths) {
        Path path;
        kotlin.jvm.internal.l0.p(base, "base");
        kotlin.jvm.internal.l0.p(subpaths, "subpaths");
        path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        kotlin.jvm.internal.l0.o(path, "get(base, *subpaths)");
        return path;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean c1(Path path) {
        boolean isReadable;
        kotlin.jvm.internal.l0.p(path, "<this>");
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path d0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.l0.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean d1(Path path, LinkOption... options) {
        boolean isRegularFile;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        isRegularFile = Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return isRegularFile;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final String e0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean e1(Path path, Path other) throws IOException {
        boolean isSameFile;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        isSameFile = Files.isSameFile(path, other);
        return isSameFile;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path f0(Path path, Path target, boolean z4) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        if (z4) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean f1(Path path) {
        boolean isSymbolicLink;
        kotlin.jvm.internal.l0.p(path, "<this>");
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path g0(Path path, Path target, CopyOption... options) throws IOException {
        Path copy;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.jvm.internal.l0.p(options, "options");
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean g1(Path path) {
        boolean isWritable;
        kotlin.jvm.internal.l0.p(path, "<this>");
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    static /* synthetic */ Path h0(Path path, Path target, boolean z4, int i5, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        if (z4) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @p4.l
    public static final List<Path> h1(@p4.l Path path, @p4.l String glob) throws IOException {
        DirectoryStream it;
        List<Path> S5;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(glob, "glob");
        it = Files.newDirectoryStream(path, glob);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            S5 = kotlin.collections.e0.S5(it);
            kotlin.io.c.a(it, null);
            return S5;
        } finally {
        }
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path i0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createDirectories;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    public static /* synthetic */ List i1(Path path, String str, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            str = org.slf4j.d.ANY_MARKER;
        }
        return h1(path, str);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path j0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createDirectory;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path j1(Path path, Path target, boolean z4) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        if (z4) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, "move(this, target, *options)");
        return move;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path k0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createFile;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path k1(Path path, Path target, CopyOption... options) throws IOException {
        Path move;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.jvm.internal.l0.p(options, "options");
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(move, "move(this, target, *options)");
        return move;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path l0(Path path, Path target) throws IOException {
        Path createLink;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        createLink = Files.createLink(path, target);
        kotlin.jvm.internal.l0.o(createLink, "createLink(this, target)");
        return createLink;
    }

    static /* synthetic */ Path l1(Path path, Path target, boolean z4, int i5, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        if (z4) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, "move(this, target, *options)");
        return move;
    }

    @p4.l
    @kotlin.g1(version = "1.9")
    public static final Path m0(@p4.l Path path, @p4.l FileAttribute<?>... attributes) throws IOException {
        Path parent;
        boolean isDirectory;
        boolean isDirectory2;
        Path createDirectories;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        parent = path.getParent();
        if (parent != null) {
            isDirectory = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (!isDirectory) {
                try {
                    FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                    createDirectories = Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
                    kotlin.jvm.internal.l0.o(createDirectories, "createDirectories(this, *attributes)");
                } catch (FileAlreadyExistsException e5) {
                    isDirectory2 = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                    if (!isDirectory2) {
                        throw e5;
                    }
                }
            }
        }
        return path;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean m1(Path path, LinkOption... options) {
        boolean notExists;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        notExists = Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return notExists;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path n0(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        Path createSymbolicLink;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final /* synthetic */ <A extends BasicFileAttributes> A n1(Path path, LinkOption... options) throws IOException {
        BasicFileAttributes readAttributes;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        kotlin.jvm.internal.l0.y(4, "A");
        readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(options, options.length));
        A a5 = (A) readAttributes;
        kotlin.jvm.internal.l0.o(a5, "readAttributes(this, A::class.java, *options)");
        return a5;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path o0(String str, FileAttribute<?>... attributes) throws IOException {
        Path createTempDirectory;
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Map<String, Object> o1(Path path, String attributes, LinkOption... options) throws IOException {
        Map<String, Object> readAttributes;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        kotlin.jvm.internal.l0.p(options, "options");
        readAttributes = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @p4.l
    public static final Path p0(@p4.m Path path, @p4.m String str, @p4.l FileAttribute<?>... attributes) throws IOException {
        Path createTempDirectory;
        Path createTempDirectory2;
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        if (path != null) {
            createTempDirectory2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.l0.o(createTempDirectory2, "createTempDirectory(dire…ory, prefix, *attributes)");
            return createTempDirectory2;
        }
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path p1(Path path) throws IOException {
        Path readSymbolicLink;
        kotlin.jvm.internal.l0.p(path, "<this>");
        readSymbolicLink = Files.readSymbolicLink(path);
        kotlin.jvm.internal.l0.o(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    static /* synthetic */ Path q0(String str, FileAttribute[] attributes, int i5, Object obj) throws IOException {
        Path createTempDirectory;
        if ((i5 & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @p4.l
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static final Path q1(@p4.l Path path, @p4.l Path base) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(base, "base");
        try {
            return d0.f19328a.a(path, base);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(e5.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e5);
        }
    }

    public static /* synthetic */ Path r0(Path path, String str, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            str = null;
        }
        return p0(path, str, fileAttributeArr);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @p4.m
    public static final Path r1(@p4.l Path path, @p4.l Path base) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(base, "base");
        try {
            return d0.f19328a.a(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path s0(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        Path createTempFile;
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @p4.l
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static final Path s1(@p4.l Path path, @p4.l Path base) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(base, "base");
        Path r12 = r1(path, base);
        if (r12 != null) {
            return r12;
        }
        return path;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @p4.l
    public static final Path t0(@p4.m Path path, @p4.m String str, @p4.m String str2, @p4.l FileAttribute<?>... attributes) throws IOException {
        Path createTempFile;
        Path createTempFile2;
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        if (path != null) {
            createTempFile2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.l0.o(createTempFile2, "createTempFile(directory…fix, suffix, *attributes)");
            return createTempFile2;
        }
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path t1(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        Path attribute2;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(attribute, "attribute");
        kotlin.jvm.internal.l0.p(options, "options");
        attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(attribute2, "setAttribute(this, attribute, value, *options)");
        return attribute2;
    }

    static /* synthetic */ Path u0(String str, String str2, FileAttribute[] attributes, int i5, Object obj) throws IOException {
        Path createTempFile;
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.l0.p(attributes, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path u1(Path path, FileTime value) throws IOException {
        Path lastModifiedTime;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        lastModifiedTime = Files.setLastModifiedTime(path, value);
        kotlin.jvm.internal.l0.o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path v0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        return t0(path, str, str2, fileAttributeArr);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path v1(Path path, UserPrincipal value) throws IOException {
        Path owner;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        owner = Files.setOwner(path, value);
        kotlin.jvm.internal.l0.o(owner, "setOwner(this, value)");
        return owner;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final void w0(Path path) throws IOException {
        kotlin.jvm.internal.l0.p(path, "<this>");
        Files.delete(path);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path w1(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        Path posixFilePermissions;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(value, "value");
        posixFilePermissions = Files.setPosixFilePermissions(path, value);
        kotlin.jvm.internal.l0.o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final boolean x0(Path path) throws IOException {
        boolean deleteIfExists;
        kotlin.jvm.internal.l0.p(path, "<this>");
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path x1(URI uri) {
        Path path;
        kotlin.jvm.internal.l0.p(uri, "<this>");
        path = Paths.get(uri);
        kotlin.jvm.internal.l0.o(path, "get(this)");
        return path;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path y0(Path path, String other) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        resolve = path.resolve(other);
        kotlin.jvm.internal.l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final <T> T y1(Path path, String glob, v3.l<? super kotlin.sequences.m<? extends Path>, ? extends T> block) throws IOException {
        DirectoryStream it;
        kotlin.sequences.m x12;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(glob, "glob");
        kotlin.jvm.internal.l0.p(block, "block");
        it = Files.newDirectoryStream(path, glob);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            x12 = kotlin.collections.e0.x1(it);
            T invoke = block.invoke(x12);
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final Path z0(Path path, Path other) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        resolve = path.resolve(other);
        kotlin.jvm.internal.l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    static /* synthetic */ Object z1(Path path, String glob, v3.l block, int i5, Object obj) throws IOException {
        DirectoryStream it;
        kotlin.sequences.m x12;
        if ((i5 & 1) != 0) {
            glob = org.slf4j.d.ANY_MARKER;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(glob, "glob");
        kotlin.jvm.internal.l0.p(block, "block");
        it = Files.newDirectoryStream(path, glob);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            x12 = kotlin.collections.e0.x1(it);
            Object invoke = block.invoke(x12);
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }
}
