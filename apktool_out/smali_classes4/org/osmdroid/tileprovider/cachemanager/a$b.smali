.class Lorg/osmdroid/tileprovider/cachemanager/a$b;
.super Lorg/osmdroid/tileprovider/cachemanager/a$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/osmdroid/tileprovider/cachemanager/a;->w(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)Lorg/osmdroid/tileprovider/cachemanager/a$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lorg/osmdroid/tileprovider/cachemanager/a;


# direct methods
.method constructor <init>(Lorg/osmdroid/tileprovider/cachemanager/a;Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lorg/osmdroid/tileprovider/cachemanager/a$b;->e:Lorg/osmdroid/tileprovider/cachemanager/a;

    iput-object p4, p0, Lorg/osmdroid/tileprovider/cachemanager/a$b;->d:Landroid/content/Context;

    invoke-direct {p0, p2, p3}, Lorg/osmdroid/tileprovider/cachemanager/a$g;-><init>(Landroid/content/Context;Lorg/osmdroid/tileprovider/cachemanager/a$h;)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lorg/osmdroid/tileprovider/cachemanager/a$g;->b(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a$b;->d:Landroid/content/Context;

    .line 5
    .line 6
    sget v1, Lorg/osmdroid/library/R$string;->h:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    new-array v2, v2, [Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, ""

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v3, 0x0

    .line 33
    aput-object p1, v2, v3

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    return-void
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
.end method

.method protected i()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/osmdroid/tileprovider/cachemanager/a$b;->d:Landroid/content/Context;

    sget v1, Lorg/osmdroid/library/R$string;->i:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
