.class public Lcom/bykv/a/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bykv/a/a/a/a/b$b;,
        Lcom/bykv/a/a/a/a/b$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field public static final d:Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/bykv/a/a/a/a/b;->b(I)Lcom/bykv/a/a/a/a/b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/bykv/a/a/a/a/b;->k()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/bykv/a/a/a/a/b;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 11
    .line 12
    new-instance v0, Lcom/bykv/a/a/a/a/b$b;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Lcom/bykv/a/a/a/a/b$b;-><init>(Lcom/bykv/a/a/a/a/b$a;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/bykv/a/a/a/a/b;->d:Lcom/bykv/vk/openvk/api/proto/Bridge;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private constructor <init>(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    return-void
.end method

.method private constructor <init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    .line 3
    iput-object p2, p0, Lcom/bykv/a/a/a/a/b;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method public static final a()Lcom/bykv/a/a/a/a/b;
    .locals 2

    new-instance v0, Lcom/bykv/a/a/a/a/b;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-direct {v0, v1}, Lcom/bykv/a/a/a/a/b;-><init>(Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static final b(I)Lcom/bykv/a/a/a/a/b;
    .locals 2

    new-instance v0, Lcom/bykv/a/a/a/a/b;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, p0}, Landroid/util/SparseArray;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/bykv/a/a/a/a/b;-><init>(Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static final j(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/a/a/a/a/b;
    .locals 2

    new-instance v0, Lcom/bykv/a/a/a/a/b;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-direct {v0, v1, p0}, Lcom/bykv/a/a/a/a/b;-><init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    return-object v0
.end method


# virtual methods
.method public c(ID)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public d(IF)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public e(II)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public f(IJ)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public g(ILjava/lang/Object;)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public h(ILjava/lang/String;)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public i(IZ)Lcom/bykv/a/a/a/a/b;
    .locals 1

    iget-object v0, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public k()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    new-instance v0, Lcom/bykv/a/a/a/a/b$c;

    iget-object v1, p0, Lcom/bykv/a/a/a/a/b;->a:Landroid/util/SparseArray;

    iget-object v2, p0, Lcom/bykv/a/a/a/a/b;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/bykv/a/a/a/a/b$c;-><init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/a/a/a/a/b$a;)V

    return-object v0
.end method
