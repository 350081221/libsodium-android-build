.class public Lcom/yuanqi/group/home/models/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Ljava/lang/CharSequence;

.field public f:I

.field public g:I

.field public h:I

.field public i:[Ljava/lang/String;

.field public j:Ljava/lang/Character;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLandroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;II[Ljava/lang/String;Ljava/lang/Character;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/yuanqi/group/home/models/c;->b:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/yuanqi/group/home/models/c;->c:Z

    .line 6
    iput-object p4, p0, Lcom/yuanqi/group/home/models/c;->d:Landroid/graphics/drawable/Drawable;

    .line 7
    iput-object p5, p0, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    .line 8
    iput p6, p0, Lcom/yuanqi/group/home/models/c;->f:I

    .line 9
    iput p7, p0, Lcom/yuanqi/group/home/models/c;->h:I

    .line 10
    iput-object p8, p0, Lcom/yuanqi/group/home/models/c;->i:[Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    return-void
.end method


# virtual methods
.method public a()Lcom/yuanqi/group/home/models/c;
    .locals 11

    new-instance v10, Lcom/yuanqi/group/home/models/c;

    iget-object v1, p0, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/yuanqi/group/home/models/c;->b:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/yuanqi/group/home/models/c;->c:Z

    iget-object v4, p0, Lcom/yuanqi/group/home/models/c;->d:Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lcom/yuanqi/group/home/models/c;->e:Ljava/lang/CharSequence;

    iget v6, p0, Lcom/yuanqi/group/home/models/c;->f:I

    iget v7, p0, Lcom/yuanqi/group/home/models/c;->h:I

    iget-object v8, p0, Lcom/yuanqi/group/home/models/c;->i:[Ljava/lang/String;

    iget-object v9, p0, Lcom/yuanqi/group/home/models/c;->j:Ljava/lang/Character;

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/yuanqi/group/home/models/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLandroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;II[Ljava/lang/String;Ljava/lang/Character;)V

    return-object v10
.end method
