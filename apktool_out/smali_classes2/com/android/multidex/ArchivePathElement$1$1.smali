.class Lcom/android/multidex/ArchivePathElement$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/multidex/ArchivePathElement$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field delegate:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "+",
            "Ljava/util/zip/ZipEntry;",
            ">;"
        }
    .end annotation
.end field

.field next:Ljava/util/zip/ZipEntry;

.field final synthetic this$1:Lcom/android/multidex/ArchivePathElement$1;


# direct methods
.method constructor <init>(Lcom/android/multidex/ArchivePathElement$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/multidex/ArchivePathElement$1$1;->this$1:Lcom/android/multidex/ArchivePathElement$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lcom/android/multidex/ArchivePathElement$1;->this$0:Lcom/android/multidex/ArchivePathElement;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/android/multidex/ArchivePathElement;->access$000(Lcom/android/multidex/ArchivePathElement;)Ljava/util/zip/ZipFile;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/android/multidex/ArchivePathElement$1$1;->delegate:Ljava/util/Enumeration;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->delegate:Ljava/util/Enumeration;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->delegate:Ljava/util/Enumeration;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/zip/ZipEntry;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v0, 0x0

    .line 40
    :goto_1
    return v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/multidex/ArchivePathElement$1$1;->next()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/lang/String;
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/android/multidex/ArchivePathElement$1$1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lcom/android/multidex/ArchivePathElement$1$1;->next:Ljava/util/zip/ZipEntry;

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
