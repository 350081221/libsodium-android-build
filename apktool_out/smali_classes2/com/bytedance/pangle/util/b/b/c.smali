.class public final Lcom/bytedance/pangle/util/b/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:J

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:J

.field private final j:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->b:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->c:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->d:J

    .line 11
    .line 12
    const-wide/16 v0, 0x1e

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->j:J

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-lez v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/pangle/util/b/b/c;->d:J

    .line 11
    .line 12
    :goto_0
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b()J
    .locals 4

    invoke-virtual {p0}, Lcom/bytedance/pangle/util/b/b/c;->c()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/bytedance/pangle/util/b/b/c;->a()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final c()J
    .locals 4

    iget v0, p0, Lcom/bytedance/pangle/util/b/b/c;->e:I

    int-to-long v0, v0

    const-wide/16 v2, 0x1e

    add-long/2addr v0, v2

    iget v2, p0, Lcom/bytedance/pangle/util/b/b/c;->g:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
