.class public Lcom/bykv/a/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bykv/a/a/a/a/a$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bykv/a/a/a/a/a;->a:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/bykv/a/a/a/a/a;->b:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/bykv/a/a/a/a/a;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/bykv/a/a/a/a/a;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a()Lcom/bykv/a/a/a/a/a;
    .locals 1

    new-instance v0, Lcom/bykv/a/a/a/a/a;

    invoke-direct {v0}, Lcom/bykv/a/a/a/a/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/bykv/a/a/a/a/a;
    .locals 0

    iput p1, p0, Lcom/bykv/a/a/a/a/a;->b:I

    return-object p0
.end method

.method public c(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/a;
    .locals 0

    iput-object p1, p0, Lcom/bykv/a/a/a/a/a;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/bykv/a/a/a/a/a;
    .locals 0

    iput-object p1, p0, Lcom/bykv/a/a/a/a/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Z)Lcom/bykv/a/a/a/a/a;
    .locals 0

    iput-boolean p1, p0, Lcom/bykv/a/a/a/a/a;->a:Z

    return-object p0
.end method

.method public f()Lcom/bykv/vk/openvk/api/proto/Result;
    .locals 7

    new-instance v6, Lcom/bykv/a/a/a/a/a$b;

    iget-boolean v1, p0, Lcom/bykv/a/a/a/a/a;->a:Z

    iget v2, p0, Lcom/bykv/a/a/a/a/a;->b:I

    iget-object v3, p0, Lcom/bykv/a/a/a/a/a;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/bykv/a/a/a/a/a;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/bykv/a/a/a/a/b;->a()Lcom/bykv/a/a/a/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    :cond_0
    move-object v4, v0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bykv/a/a/a/a/a$b;-><init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/a/a/a/a/a$a;)V

    return-object v6
.end method
