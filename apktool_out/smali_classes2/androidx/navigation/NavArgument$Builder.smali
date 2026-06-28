.class public final Landroidx/navigation/NavArgument$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/navigation/NavArgument;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u00020\u0000\"\u0004\u0008\u0000\u0010\u000e2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u0002H\u000e0\u0008R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/navigation/NavArgument$Builder;",
        "",
        "()V",
        "defaultValue",
        "defaultValuePresent",
        "",
        "isNullable",
        "type",
        "Landroidx/navigation/NavType;",
        "build",
        "Landroidx/navigation/NavArgument;",
        "setDefaultValue",
        "setIsNullable",
        "setType",
        "T",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private defaultValue:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private defaultValuePresent:Z

.field private isNullable:Z

.field private type:Landroidx/navigation/NavType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/navigation/NavType<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Landroidx/navigation/NavArgument;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavArgument$Builder;->type:Landroidx/navigation/NavType;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/navigation/NavType;->Companion:Landroidx/navigation/NavType$Companion;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/navigation/NavArgument$Builder;->defaultValue:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/navigation/NavType$Companion;->inferFromValueType(Ljava/lang/Object;)Landroidx/navigation/NavType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance v1, Landroidx/navigation/NavArgument;

    .line 19
    .line 20
    iget-boolean v2, p0, Landroidx/navigation/NavArgument$Builder;->isNullable:Z

    .line 21
    .line 22
    iget-object v3, p0, Landroidx/navigation/NavArgument$Builder;->defaultValue:Ljava/lang/Object;

    .line 23
    .line 24
    iget-boolean v4, p0, Landroidx/navigation/NavArgument$Builder;->defaultValuePresent:Z

    .line 25
    .line 26
    invoke-direct {v1, v0, v2, v3, v4}, Landroidx/navigation/NavArgument;-><init>(Landroidx/navigation/NavType;ZLjava/lang/Object;Z)V

    .line 27
    .line 28
    .line 29
    return-object v1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
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

.method public final setDefaultValue(Ljava/lang/Object;)Landroidx/navigation/NavArgument$Builder;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/NavArgument$Builder;->defaultValue:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/navigation/NavArgument$Builder;->defaultValuePresent:Z

    .line 5
    .line 6
    return-object p0
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

.method public final setIsNullable(Z)Landroidx/navigation/NavArgument$Builder;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    iput-boolean p1, p0, Landroidx/navigation/NavArgument$Builder;->isNullable:Z

    return-object p0
.end method

.method public final setType(Landroidx/navigation/NavType;)Landroidx/navigation/NavArgument$Builder;
    .locals 1
    .param p1    # Landroidx/navigation/NavType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavType<",
            "TT;>;)",
            "Landroidx/navigation/NavArgument$Builder;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string/jumbo v0, "type"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/navigation/NavArgument$Builder;->type:Landroidx/navigation/NavType;

    .line 8
    .line 9
    return-object p0
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
