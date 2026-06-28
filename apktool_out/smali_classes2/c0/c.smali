.class public final Lc0/c;
.super Lc0/b;
.source "SourceFile"


# instance fields
.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/c;->f:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lc0/b;->a:B

    .line 3
    .line 4
    iget-object v0, p0, Lc0/c;->f:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "UTF-8"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lc0/b;->c:[B

    .line 13
    .line 14
    array-length v0, v0

    .line 15
    int-to-byte v0, v0

    .line 16
    iput-byte v0, p0, Lc0/b;->b:B

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method
