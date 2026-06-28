.class public final Lcom/huawei/hms/analytics/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/analytics/framework/config/RomAttributeCollector;


# instance fields
.field A:I

.field B:I

.field a:Ljava/lang/String;

.field abc:Ljava/lang/String;

.field b:Ljava/lang/String;

.field bcd:Ljava/lang/String;

.field c:I

.field cde:Ljava/lang/String;

.field d:I

.field def:Ljava/lang/String;

.field e:Ljava/lang/String;

.field efg:Ljava/lang/String;

.field f:Z

.field fgh:Ljava/lang/String;

.field g:Ljava/lang/Boolean;

.field ghi:Ljava/lang/String;

.field h:Ljava/lang/String;

.field hij:Ljava/lang/String;

.field i:Ljava/lang/String;

.field ijk:Ljava/lang/String;

.field ikl:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:J

.field klm:Ljava/lang/String;

.field l:J

.field lmn:Ljava/lang/String;

.field m:J

.field n:J

.field o:I

.field p:Ljava/lang/String;

.field q:Z

.field r:Ljava/lang/String;

.field s:Ljava/lang/String;

.field t:Ljava/lang/String;

.field u:Ljava/lang/Integer;

.field v:Ljava/lang/Integer;

.field w:Ljava/lang/Boolean;

.field x:Ljava/lang/Boolean;

.field y:Ljava/lang/String;

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final doCollector()Lorg/json/JSONObject;
    .locals 5

    const-string v0, ""

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "_is_testdevice"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->A:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_new_user_flag"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->z:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_signed"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->B:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_rom_ver"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->lmn:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_emui_ver"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->klm:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_user_agent"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->s:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_model"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->ikl:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_package_name"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->ijk:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_app_ver"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->hij:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_lib_ver"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->ghi:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_lib_name"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->def:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_lib_type"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->cde:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_channel"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->efg:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_restriction_enabled"

    iget-boolean v3, p0, Lcom/huawei/hms/analytics/bv;->f:Z

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "_restriction_shared"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->g:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_terminal_name"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->fgh:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_sys_language"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_manufacturer"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_os"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->bcd:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_os_ver"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->abc:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_screen_height"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->c:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_screen_width"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->d:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_device_category"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->e:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_ab_info"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_oaid_tracking_flag"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_network_type"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_total_storage"

    iget-wide v3, p0, Lcom/huawei/hms/analytics/bv;->k:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "_free_storage"

    iget-wide v3, p0, Lcom/huawei/hms/analytics/bv;->l:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "_free_memory"

    iget-wide v3, p0, Lcom/huawei/hms/analytics/bv;->n:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "_total_memory"

    iget-wide v3, p0, Lcom/huawei/hms/analytics/bv;->m:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "_battery_level"

    iget v3, p0, Lcom/huawei/hms/analytics/bv;->o:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "_battery_state"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->p:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_allow_push"

    iget-boolean v3, p0, Lcom/huawei/hms/analytics/bv;->q:Z

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v2, "_first_open_time"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->r:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_font_family"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_font_size"

    iget-object v3, p0, Lcom/huawei/hms/analytics/bv;->t:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_font_weight"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "_font_style"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "_screen_brightness"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bv;->u:Ljava/lang/Integer;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "_ringer_mode"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bv;->v:Ljava/lang/Integer;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "_dark_mode"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bv;->w:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "_auto_rotate"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bv;->x:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "_campaign_info"

    iget-object v2, p0, Lcom/huawei/hms/analytics/bv;->y:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "OpennessRomGathering"

    const-string v2, "doCollector JSONException"

    invoke-static {v0, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method
