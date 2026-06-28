.class public Lcom/orhanobut/logger/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orhanobut/logger/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:Z

.field d:Lcom/orhanobut/logger/h;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Lcom/orhanobut/logger/l$b;->a:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/orhanobut/logger/l$b;->b:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/orhanobut/logger/l$b;->c:Z

    const-string v0, "PRETTY_LOGGER"

    .line 6
    iput-object v0, p0, Lcom/orhanobut/logger/l$b;->e:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/orhanobut/logger/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/orhanobut/logger/l$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/orhanobut/logger/l;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/orhanobut/logger/l$b;->d:Lcom/orhanobut/logger/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/orhanobut/logger/i;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/orhanobut/logger/i;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/orhanobut/logger/l$b;->d:Lcom/orhanobut/logger/h;

    .line 11
    .line 12
    :cond_0
    new-instance v0, Lcom/orhanobut/logger/l;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Lcom/orhanobut/logger/l;-><init>(Lcom/orhanobut/logger/l$b;Lcom/orhanobut/logger/l$a;)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public b(Lcom/orhanobut/logger/h;)Lcom/orhanobut/logger/l$b;
    .locals 0
    .param p1    # Lcom/orhanobut/logger/h;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/orhanobut/logger/l$b;->d:Lcom/orhanobut/logger/h;

    return-object p0
.end method

.method public c(I)Lcom/orhanobut/logger/l$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/orhanobut/logger/l$b;->a:I

    return-object p0
.end method

.method public d(I)Lcom/orhanobut/logger/l$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/orhanobut/logger/l$b;->b:I

    return-object p0
.end method

.method public e(Z)Lcom/orhanobut/logger/l$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lcom/orhanobut/logger/l$b;->c:Z

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/orhanobut/logger/l$b;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/orhanobut/logger/l$b;->e:Ljava/lang/String;

    return-object p0
.end method
