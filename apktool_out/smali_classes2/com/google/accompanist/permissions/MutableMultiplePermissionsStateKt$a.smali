.class final Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt;->a(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/google/accompanist/permissions/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $multiplePermissionsState:Lcom/google/accompanist/permissions/d;


# direct methods
.method constructor <init>(Lcom/google/accompanist/permissions/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$a;->$multiplePermissionsState:Lcom/google/accompanist/permissions/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$a;->invoke(Ljava/util/Map;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$a;->$multiplePermissionsState:Lcom/google/accompanist/permissions/d;

    const-string v1, "permissionsResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/accompanist/permissions/d;->j(Ljava/util/Map;)V

    .line 3
    iget-object p1, p0, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$a;->$multiplePermissionsState:Lcom/google/accompanist/permissions/d;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/accompanist/permissions/d;->i(Z)V

    return-void
.end method
